public class Student extends People{
    double mathScores;
    double physicsScores;
    double chemistryScores;




    public Student() {
    }

    public Student(String name, int age, int id, double mathScores, double physicsScores, double chemistryScores) {
        super(name, age, id);
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;

    }
    public double getMediumScores(){
        return (mathScores+ physicsScores+chemistryScores)/3;
    }



    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicsScores() {
        return physicsScores;
    }

    public void setPhysicsScores(double physicsScores) {
        this.physicsScores = physicsScores;
    }

    public double getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(double chemistryScores) {
        this.chemistryScores = chemistryScores;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", id=" + getId() +
                "mathScores=" + mathScores +
                ", physicsScores=" + physicsScores +
                ", chemistryScores=" + chemistryScores +
                ", mediumScores=" +   (mathScores+ physicsScores+chemistryScores)/3 +
                '}';
    }
}
