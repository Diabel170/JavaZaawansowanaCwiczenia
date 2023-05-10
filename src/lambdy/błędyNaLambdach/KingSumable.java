package lambdy.błędyNaLambdach;
@FunctionalInterface
public interface KingSumable {
    Integer sum(int i, int i1);
  static Integer doubleSumInterfaceObject(int i, int j){
        return i+j+i+j; //możemy mieć statyczną z ciałem w interface
    }
}

