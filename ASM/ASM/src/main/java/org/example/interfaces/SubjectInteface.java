package org.example.interfaces;

public interface SubjectInteface {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
