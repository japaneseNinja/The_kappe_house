/**
 *
 * @author KappeMan
 *
 */
public class LikeListTets {

	public static void main(String[] args) {
		LikeList list = new LikeList();
		list.add(1);
		list.get();
		list.add(2);
		list.get();
		list.remove(0);
		list.get();
		list.add("鈴村", 2);
		list.get();
		System.out.println(list.get(0));
		System.out.println(list.contains("鈴村"));
	}
}

/*
 * 7/25 Listクラスと同様の機能を持つクラスを作成する ・クラス名　LikeList ・ジェネリクスを使って様々な型に対応させること <機能>
 * ・最後に挿入 - boolean add(Objct obj) ・任意のインデックスに挿入 - boolean add(Object obj, int
 * idx) ・インデックスを指定して削除 - boolean remove(int idx) ・インデックスを指定して値の取得 - Object
 * get(int idx) ・リストに指定された値が含まれているかを判断する - boolean contains(Object)
 * ※StringとObjectに対応させる ・要素数の取得 - int size ※フィールド ・配列に変換 - Object[] toArray()
 * ・要素のコピー - clone() - ディープコピーであること <テスト> ・以下のことが保障されていること -
 * String,Integer,独自クラスで上記の機能が使えること - remove()メソッドで要素を消した場合、要素数とsizeの値が同じであること -
 * clone()ﾒｿｯﾄﾞでコピーしたオブジェクトは元のオブジェクトと参照先
 */
