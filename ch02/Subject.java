package ch02;

public interface Subject {
  public void registerobserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
  
}
