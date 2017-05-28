package com.ami.util;

import java.util.Comparator;

public class Comparison {
	public static class Binary implements Comparator<String> {
		@Override
		public int compare(String arg0, String arg1) {
			return arg0.compareTo(arg1);
		}
	}
	
	public static class Text implements Comparator<String> {
		@Override
		public int compare(String arg0, String arg1) {
			return arg0.compareToIgnoreCase(arg1);
		}
	}
	
	public static class NoSpaceBinary implements Comparator<String> {
		@Override
		public int compare(String arg0, String arg1) {
			String str0 = arg0.replace(" ", "");
			String str1 = arg1.replace(" ", "");			
			return str0.compareTo(str1);
		}
	}
	
	public static class NoSpaceText implements Comparator<String> {
		@Override
		public int compare(String arg0, String arg1) {
			String str0 = arg0.replace(" ", "");
			String str1 = arg1.replace(" ", "");			
			return str0.compareToIgnoreCase(str1);
		}
	}
}