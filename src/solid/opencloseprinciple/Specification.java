package solid.opencloseprinciple;

interface Specification<T> {
    boolean isSatisfied(T item);
}
