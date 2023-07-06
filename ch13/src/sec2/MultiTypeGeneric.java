package sec2;

import java.util.Map;

//Map은 키(key)와 값(value)을 쌍으로 저장하고 있는 컬렉션프레임워크 자료구조이다.
//(key : value); => ex) {name  : "강아지" } name은 key 이고, "강아지는" value
public class MultiTypeGeneric<K,V> implements Map.Entry<K,V>{
	private K key;
	private V value;
	@Override
	public K getKey() {
		return this.key;
	}
	@Override
	public V getValue() {
		return this.value;
	}
	@Override
	public V setValue(V value) {
		this.value =value;
		return value;
	}
	
	//값만 세터 할수있음 - key는 클래스이름이라 세터를 할수없음
//	@Override
//	public K setKey(K key){
//		return this.key;
//	}
	

}
