import java.util.*;

interface Action1<T> {
	void call(T t);
}
abstract class Subscriber<T> {
}
interface OnSubscribe<T> extends Action1<Subscriber<? super T>> {
}
class Test {
	public static void main(String []args){
		new OnSubscribe<List>() {
			@Override
				public void call(Subscriber<? super List> o){
					System.out.println("called");
				}
		}.call(null);
	}
}
