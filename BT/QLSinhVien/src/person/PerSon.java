package person;

import java.util.Scanner;

public class PerSon {
    protected int age;
    protected String name;
    protected String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void EnterPerSon()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
    }
}
