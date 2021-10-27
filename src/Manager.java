public interface Manager<T> {
void add (T t);
void print ();
void edit (int id , T t);
int search (int id);
void  delete (int id );
}
