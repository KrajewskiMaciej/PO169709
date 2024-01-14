public interface LoudAnimal {
    abstract void makeNoise();
}

class Dog implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Hau Hau");
    }
}

class Cat implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Miau Miau");
    }
}