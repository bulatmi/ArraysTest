package test;


public class ArrSort {

	public static void main(String[] args) {
		
		ArrMethods arrmeth = new ArrMethods();   // ��������� ������ � �������� ��� ������ � ���������
		
		int[] arr = arrmeth.randGenIntArr(50, 15);
		System.out.println("�������� ������:");
		arrmeth.outputIntArr(arr);
		System.out.println("���������: ");
		arrmeth.outputIntArr(arrmeth.arrSortBub(arr));
		
		System.out.println("----------------------------------------------"); 
		
		int[] arr2 = arrmeth.randGenIntArr(100, 20); 
		System.out.println("�������� ������:");
		arrmeth.outputIntArr(arr2);
		System.out.println("���������: ");
		arrmeth.outputIntArr(arrmeth.arrCombSort(arr2));		
	}
	
	
}
