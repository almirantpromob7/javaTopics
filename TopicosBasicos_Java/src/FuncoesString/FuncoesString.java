package FuncoesString;

public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		// toLowerCase = String minúsculas!
		System.out.println("- " +original+ " - Sem comando para mudar o formato da letra!");
		System.out.println("- " +s01+ " - Usando o toLowerCase");
		
		String s02 = original.toUpperCase();
		//toUpperCase = String maiúscula!
		System.out.println("- " +s02+ " - Usando o toUpperCase");
		
		String s03 = original.trim();
		//trim = String com os espaços eliminados nos cantos!
		System.out.println("- " +s03+ " - Usando o trim");
		
		String s04 = original.substring(2);
		//substrig = pega somente os caracteries indicados a partir da numeração indicada no comando!
		System.out.println("- " +s04+ " - Usando o substring, passando (2) como argumento");
		String s05 = original.substring(2, 9);
		//vai recortar 2 strings a partir da 9ª String!
		System.out.println("- " +s05+ " - Usando o substring");
		
		String s06 = original.replace('a', 'x');
		//replace = vai trocar por exemplo um a por um x!
		System.out.println("- " +s06+ " - Usando o replace");
		String s07 = original.replace("abc", "xy");
		//posso usar também para uma substring, trocando um abc por xy!
		System.out.println("- " +s07+ " - Usando o replace");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		//indexOf vai mostrar qual a primeira posição da substring bc!
		//lastIdexOf mostra a última posição do bc!
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}

}
