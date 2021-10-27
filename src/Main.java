//import java.util.Scanner;
//
//public class Main {
//    private static ManagerStuden managerStuden;
//    public static void main(String[] args) {
//managerStuden = new ManagerStuden();
//        Scanner scanner = new Scanner(System.in);
//        int input;
//        System.out.println("bảng danh sách học sinh ");
//        do {
//            System.out.println("nhập 0 để thoát ra ");
//            System.out.println("nhập 1 để nhập vào học sinh mới ");
//            System.out.println("nhập 2 để in ra danh sách học sinh ");
//            System.out.println("nhập 3 để tìm kiếm học sinh ");
//            System.out.println("nhập 4 đê xóa học sinh ");
//            System.out.println("nhập 5 để sửa học sinh");
//            System.out.println("nhập 6 để sắp sếp học sinh theo điểm trung bình ");
//            System.out.println("nhập 7 in ra học sinh có điểm trung bình cao nhất ");
//            input = scanner.nextInt();
//            if (input>0&&input<7){
//                switch (input){
//                    case 1:
//                        System.out.println("nhập tuổi học sinh ");
//                        double age = scanner.nextInt();
//                        System.out.println(("nhập id "));
//                        double id = scanner.nextInt();
//                        System.out.println("nhập điểm điểm toán ");
//                        double mathScores = scanner.nextInt();
//                        System.out.println("nhập điểm vật lý ");
//                        double physicsScores =scanner.nextInt();
//                        System.out.println("nhập vào điểm hóa ");
//                        double chemistryScores = scanner.nextInt();
//                        System.out.println("nhập tên học sinh ");
//                        String name = scanner.nextLine();
//                        managerStuden.add(new Student(name,age,id,mathScores,physicsScores,chemistryScores));
//                }
//            }
//        }
//    }
//}
