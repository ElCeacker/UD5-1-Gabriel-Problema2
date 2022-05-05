public class GenericStack<T> {
    private static final int CAPACIDAD_INICIAL = 5;
    private static final int TOP = 0;

    private CustomColection colection = new CustomColection(CAPACIDAD_INICIAL);

    public void push(T element) {
        colection.insert(element, TOP);
    }

    public int pop() {

        Object borrar = colection.delete(TOP);
        int borrarNumero = (Integer)borrar;
        return borrarNumero;
    }

    public int length() {
        return colection.length();
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < colection.length(); i++) {
            salida += colection.getElement(i).toString();
            salida += "\n";

        }
        return salida;
    }
}
