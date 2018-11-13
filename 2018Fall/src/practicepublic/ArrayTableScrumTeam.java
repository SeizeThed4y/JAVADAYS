package practicepublic;

public class ArrayTableScrumTeam {

	public static void main(String[] args) {

		System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " Scrum Team " + "\n");

		System.out.println("FirstName     LastName     \tPhoneNumber      \tEmailAdress \t\t\tPosition(Role)" + "\n");
		System.out.println(
				"===============================================================================================================");

		String firstName[] = {"Mevlude" , "Vinure", "Shayida", "Zulyar", "Misran", "Abida", "Elzat", "Ankar", "Feruk", "Kurxat", "Imran" ,  };

		String lastName[] = {"Amin" , "Jaipaer", "Ali", "Kurban", "Rifat" ,"Adil", "Zayner", "Uyghur", "coskun", "Rahman", "Niyaz", };

		String phoneNumber[] = { "(202)437-9282" ,"(371)123-7654", "(123)987-6543", "(202)333-5076", "(571)437-1233","(202)734-2398", "(202)123-4567",
				"(202)736-5432", "(202)494-3305", "(202)632-1236", "(202)123-0987", };

		String emailAddress[] = {"MevludeAmin@gmail.com", "VinureJaipaer@gmail.com", "ShayidAli@gmail.com", "ZulyarKurban@gmail.com", "MisranRifat@gmail.com", "AbidaAdil@gmail.com",
				"ElzatZayner@gmail.com", "AnkarUyghur@gmail.com", "ferukcoskun@gmail.com", "KurxatRahman@gmail.com", "ImranNiyaz@gmail.com",  };

		String positionRole[] = {"Project Manager" , "Product Owner", "Scrum Master", "Developer" ,"Developer", "Developer", "Developer", "Developer",
				"Tester   ", "Tester    ","Tester    ", };

		for (int counter = 0; counter < firstName.length && counter < lastName.length && counter < phoneNumber.length
				&& counter < emailAddress.length && counter < positionRole.length; counter++) {

			for (int i = 0; i < 1; i++) {
				System.out.println("\t"
						+ " |              |                        |                              |                             |"

						+ "\n" + "\t " + "|              "

						+ "|                        |                              |                             |"

						+ "\n" + "\t"
						+ " |              |                        |                              |                             |");
			}

			System.out.println(firstName[counter] + "\t" + " |" +"\t"+ lastName[counter] + "\t" + "|" + "\t"
					+ phoneNumber[counter] + "\t" + " |" + "\t" + emailAddress[counter] + "\t" + "|" +"\t"
					+  positionRole[counter]+ "\t" +"      |" 
					+ "\n --------|--------------|------------------------|----------"
				

					+ "--------------------|-----------------------------|");

		}

	}

}
