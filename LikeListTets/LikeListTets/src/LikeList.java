/**
 *
 * @author KappeMan
 *
 * @param <T>
 */
public class LikeList<T> {

	int size; // 配列にオブジェクトを代入した際にカウントされる配列のサイズを表す変数です。
	Object obj; // 引数で受け取ったT型のオブジェクトのデータを保持します。
	T[] mainLikeListArray; // メインで使用する配列です
	T[] subLikeListArray; // main配列生成のたびに失われるデータを保持する配列です

	/**
	 *
	 * @param t IntegerやStringなどのデータを受け取ります。
	 * @return true
	 */
	boolean add(T t) {
		this.obj = t;
		size++;
		mainLikeListArray = (T[]) new Object[size];
		for (int i = 0; i < size - 1; i++) { // 配列subに保持されたデータをarayにコピーしています。
			Object s = subLikeListArray[i];
			mainLikeListArray[i] = (T) s;
		}
		subLikeListArray = (T[]) new Object[size + 1];
		mainLikeListArray[size - 1] = (T) obj;
		for (int i = 0; i < size; i++) { // 配列subが新しく生成されたのでarayのデータをsubにコピーしています。
			Object s = mainLikeListArray[i];
			subLikeListArray[i] = (T) s;
		}
		return true;
	}

	/**
	 *
	 * 配列の中身をすべて表示するメソッドです
	 */
	void get() {
		for (Object i : mainLikeListArray) {
			System.out.println(i);
		}
		System.out.println("");
	}

	/**
	 *
	 * @param t 配列に挿入したいオブジェクト
	 * @param idx 挿入したいindex
	 * @return true
	 */
	boolean add(T t, int idx) { // indexを指定し、そこにIntegerやStringを挿入するメソッドです。
		this.obj = t;
		size++;
		mainLikeListArray = (T[]) new Object[size];
		for (int i = 0; i < size; i++) { //
			if (i == idx) { // 指定されたIndexに到達したときの分岐し指定オブジェクトを代入します。
				mainLikeListArray[i] = (T) obj;
				i++;
				for (; i < size; i++) { // 指定index以降のオブジェクトを代入します。
					Object s = subLikeListArray[i - 1];
					mainLikeListArray[i] = (T) s;
				}
			}

			else {
				Object s = subLikeListArray[i];
				mainLikeListArray[i] = (T) s;
			}

		}

		subLikeListArray = (T[]) new Object[size + 1];
		for (int i = 0; i < size; i++) { // 配列subにコピーしています
			Object s = mainLikeListArray[i];
			subLikeListArray[i] = (T) s;
		}
		return true;
	}

	/**
	 *
	 * @param idx 削除するIndexを指定します
	 * @return true
	 */
	boolean remove(int idx) {
		mainLikeListArray[idx] = null;
		subLikeListArray[idx] = null;
		return true;
	}

	/**
	 *
	 * @param id 値を取得したいindexを指定します。
	 * @return オブジェクトを返します
	 */
	T get(int idx) {
		return mainLikeListArray[idx];
	}

	/**
	 *
	 * @param t Listに格納されているか調べたいオブジェクトを指定します
	 * @return 格納されていればtrue、格納されていなければfalseを返します
	 */
	boolean contains(T t) {
		for (int i = 0; i < size; i++) {
			if (t.equals(mainLikeListArray[i])) {
				System.out.println("");
				return true;
			}
		}
		System.out.println("");
		return false;
	}
}