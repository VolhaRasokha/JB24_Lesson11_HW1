package by.epam.library.view;

import java.util.List;

import by.epam.library.entity.PrintedEdition;

public class PrintAsTable implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {
		System.out
				.println("-------------Print printed edition by price as table--------------");
		System.out.println("");
		System.out.println("--------------------------");
		System.out.println("|Title          | Price  |");
		System.out.println("--------------------------");
		for (int i = 0; i < units.size(); i++) {
			System.out.printf("|%-14s | %4s\n", units.get(i).getTitle(), units
					.get(i).getPrice() + "$ |");
			System.out.println("--------------------------");
		}
	}
}
