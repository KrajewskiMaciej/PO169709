public class Teacher implements Cloneable{
    String imie;
    String subject;
    int experience;

    public Teacher(int experience){
        this.experience=experience;
    }

    public void setExperience(int experience){
        this.experience=experience;
    }

    public String toString(){
        return "Doświadczenie: "+experience;
    }

    @Override
    public Teacher clone(){
        try{
            return (Teacher) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
