/*Pprograma que dice si los arreglos son ascendentes, descendentes, 
 * ordenados, desordenados o iguales
 * 
 * 
 * */

package org.tess;



public class Test1 {
	
	private static String describirArreglo (int [] arr) {
		boolean desc = true;
		boolean asc = true; 
		for (int i =1; i<arr.length && (desc || asc); ++i) {
			if (arr[i-1]< arr[i]) desc = false;
			if (arr[i-1]< arr[i]) asc = false;		
		}
		
		if (desc || asc) {
			if ( desc && asc) {
				return "TODOS_IGUALES";
			}
			return desc ? "ASCENDENTE" : "DESCENDENTE";
		}
		return "DESORDENADO"; 
	}

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5, 6, 7};
		int [] arr1 = {100, -2, 35, 0};
		int [] arr2 = {2, 2, 2, 2, 2};
		int [] arr3 = {01, 1, 0, 1, 0};
		System.out.println(describirArreglo(arr));
		System.out.println(describirArreglo(arr1));
		System.out.println(describirArreglo(arr2));
		System.out.println(describirArreglo(arr3));
		// TODO Auto-generated method stub 

	}

}
