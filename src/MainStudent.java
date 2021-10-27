public class MainStudent {
    public static void main(String[] args) {
        ManagerStuden managerStuden = new ManagerStuden();
        managerStuden.add(new Student("la",23,0,5.0,1.5,9.4));
        managerStuden.add(new Student("la2",23,1,7.0,2.8,8.8));
        managerStuden.add(new Student("la3",23,2,9.0,8.3,2.8));
        managerStuden.add(new Student("la4",23,3,3.0,3.9,3.9));
        managerStuden.add(new Student("la5",23,4,2.0,7.2,5.5));
        managerStuden.print();
        //managerStuden.search(3);
       // managerStuden.edit(3,new Student("sua",34,5,9.9,8.9,9.8));
       // managerStuden.delete(1);
       // managerStuden.print();
       // managerStuden.sort();
        managerStuden.highestPoint();
        managerStuden.print();
    }
}
