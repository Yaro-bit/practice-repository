package SummaryBasics;

public class Member {
	static String name;
	int  memberId;
	int borrowedBooksCount;
	
	public Member() {
		this("name undefined", -1, -1);
	}
	public Member(String name, int memberId, int borrowedBooksCount) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooksCount = borrowedBooksCount;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", borrowedBooksCount=" + borrowedBooksCount + "]";
	}
	
}
//Member: Repräsentiert ein Mitglied der Bibliothek mit den Eigenschaften:
//    Name (name)
//    Mitgliedsnummer (memberId)
//    Anzahl der ausgeliehenen Bücher (borrowedBooksCount).