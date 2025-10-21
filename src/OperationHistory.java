import java.util.ArrayList;
import java.util.List;

public class OperationHistory {
private List<String> recordOperation; //создали образ списка

public OperationHistory() {
    recordOperation = new ArrayList<>(); // выделили списку память
}

// метод для добавления оперций в историю

public void addRecord(String operationName, double result) {
    recordOperation.add(operationName + result);
}

//метод для вывода списка

    public void printHistory() {
        System.out.println("История Ваших вычислений");
        for (String entry : recordOperation){
            System.out.println(entry);
        }
    }

 }



