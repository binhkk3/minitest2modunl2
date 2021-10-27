import java.util.ArrayList;

public class ManagerStuden implements Manager<Student> {
    ArrayList<Student> liststudent;
    public ManagerStuden(ArrayList<Student> arrayList) {this.liststudent = arrayList;}
    public ManagerStuden (){liststudent = new ArrayList<>();}
    @Override
    public void add(Student student) {
liststudent.add(student);
    }

    @Override
    public void print() {
        for (int i = 0; i < liststudent.size(); i++) {
            System.out.println(liststudent.get(i));
        }
        System.out.println("con gà này");
    }

    @Override
    public void edit(int id, Student student) {
        int index = search(id);
        if (index == -1) {
            System.out.println(" không có để sửa");
        } else {
            liststudent.set(index, student);
        }

    }

    @Override
    public int search(int id) {
        for (int i = 0; i < liststudent.size(); i++) {
            if (liststudent.get(i).getId() == id) {
                System.out.println("có " + id + liststudent.get(i).getName());
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        int index = search(id);
        if (index == -1) {
            System.out.println(" không có để sửa");
        } else {
            liststudent.remove(search(id));
        }
    }
}
