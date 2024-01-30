package names;

// Ogrenci isimli sınıf oluşturun. Bu sınıfta ogrencinin idsi ve not değeri
// tutulmalı.
// 100 elemanlı bir dizide id ve not değerlerini rastgele olusturarak bu
// ogrencileri saklayın
// ve bu ogrencileri aldıkları notlara göre azalan sırada yazdıran metotu yazın.
public class classes {

	public static void main(String[] args) {

		Student[] students = new Student[100];
		
		for (int i = 0; i < students.length; i++) {
			int rastgeleID = (int)(Math.random() * 5001);
            int rastgeleNotDegeri = (int)(Math.random() * 101);
            
            Student yenı = new Student(rastgeleID, rastgeleNotDegeri);
            students[i] =yenı;	
		}
		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}

	}

}

class Student {

	private int id;
	private int not;

	public Student(int id, int not) {
		this.id = id;
		this.not = not;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}
	public void showInfo() {
		System.out.println(getId()+" student is note "+getNot());
	}

}
