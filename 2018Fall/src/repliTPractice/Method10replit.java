package repliTPractice;

public class Method10replit {
	public static String lameDb(String db, String op, String id, String data) {
		String result = "";

		switch (op) {

		case "add":
			result = db + "#" + id + data;
		case "edit":
			String[] str = db.split("#");
			result = str[0] + str[1].replaceAll(str[1], "#" + id + data) + "#" + str[2];
		case "delete":

			String[] split2 = db.split("#");

			if (split2[0].contains(id)) {
				result = db.replace(split2[0], "");

			} else if (split2[1].contains(id)) {
				result = db.replace(split2[1], "");
			} else if (split2[2].contains(id)) {
				result = db.replace(split2[2], "");
			}

		case "none":
			result = db;

		}
		return result;
		

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}

}
