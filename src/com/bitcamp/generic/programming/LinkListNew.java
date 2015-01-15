package com.bitcamp.generic.programming;

import java.util.Iterator;

/**
 * 
 * @author Edib Imamovic
 *
 * @param <T>
 */
public class LinkListNew<T> implements Iterable<T> {

	private Node<T> head;

	public LinkListNew() {

		head = null;
	}

	/**
	 * Method for add
	 * 
	 * @param value
	 */
	public void add(int value) {

		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;

		} else {
			Node current = head;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = newNode;

		}

	}

	/**
	 * Method for getSize
	 * 
	 * @return counter
	 */
	public int getSize() {
		Node current = head;
		int counter = 0;
		while (current != null) {
			current = current.nextNode;
			counter++;
		}

		return counter;

	}

	/**
	 * Method for remove
	 * 
	 * @param index
	 */
	public void remove(int index) {

		if (index == 0) {
			head = head.nextNode;

			return;
		}
		Node current = head.nextNode;
		Node previous = head;
		int counter = 1;

		while (counter < index) {
			current = current.nextNode;
			previous = previous.nextNode;
			counter++;
		}

		previous.nextNode = current.nextNode;
		current.nextNode = null;

	}

	/**
	 * Inner Class Node for ExGeneric Class
	 * 
	 * @author edibimamovic
	 *
	 * @param <T>
	 */
	private class Node<T> {

		public T value;
		public Node nextNode;

		public Node(T value) {
			this.value = value;
			nextNode = null;

		}
	}

	/**
	 * Method for toString
	 */
	public String toString() {
		String str = "";
		Node current = head;
		while (current != null) {
			str += current.value + " ";
			current = current.nextNode;
		}
		return str;

	}

	/**
	 * Iterator
	 */
	public Iterator<T> iterator() {

		return new Biterator<T>(head);
	}

	/**
	 * Class Biterator is our Iterator
	 * 
	 * @author edibimamovic
	 *
	 * @param <T>
	 */
	private class Biterator<T> implements Iterator<T> {

		private Node<T> current;

		public Biterator(Node start) {
			current = start;
		}

		@Override
		public boolean hasNext() {

			return current.nextNode != null;
		}

		@Override
		public T next() {
			T value = current.value;
			current = current.nextNode;
			return value;
		}

	}
}
