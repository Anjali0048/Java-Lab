package Anjali;

public class Overloading {
	
	static class Format{
		private String formatNumber(int value) {
			return String.format("%d",value);
		}
		private String formatNumber(double value) {
			return String.format("%.3f", value);
		}
		private String formatNumber(String value) {
			return String.format("%.2f", Double.parseDouble(value));
		}	
	}
	public static void main(String[] args) {	
		Format num = new Format();
		System.out.println(num.formatNumber(452));
		System.out.println(num.formatNumber(15.564));
		System.out.println(num.formatNumber("7155"));
	
	}
}

