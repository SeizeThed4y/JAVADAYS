import java.util.Scanner;

public class test3 {

	public static String lameDb(String db, String op, String id, String data) {
		String result = "";
		
		String missingColumn = "#" + id + data;
		switch (op) {
		case "add":
			if (id.equals("1")) {
				result = missingColumn.replaceFirst("#", "") + "#" + db;
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#3")) + missingColumn + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				result = db.substring(0, db.indexOf("#4")) + missingColumn + db.substring(db.indexOf("#4"));
			} else {
				result = db + missingColumn;
			}
			break;
		case "edit":
			if (id.equals("1")) {
				result = id + data + "#" + db.substring(db.indexOf("2"));
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#2")) + missingColumn + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				result = db.substring(0, db.indexOf("#3")) + missingColumn + db.substring(db.indexOf("#4"));
			} else
				result = db.substring(0, db.indexOf("#4")) + missingColumn;
			break;
		case "delete":
			if (id.equals("1")) {
				result = db.substring(db.indexOf("2"));
			} else if (id.equals("2")) {
				result = db.substring(0, db.indexOf("#2")) + db.substring(db.indexOf("#3"));
			} else if (id.equals("3")) {
				if (db.contains("4"))
					result = db.substring(0, db.indexOf("#3")) + db.substring(db.indexOf("#4"));
				else
					result = db.substring(0, db.indexOf("#3"));
			} else
				result = db.substring(0, db.indexOf("#4"));
			break;
		case "none":
			result = db;
			break;
		default:
			break;

		}// end lameDb
		return result;
	}

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}
}
