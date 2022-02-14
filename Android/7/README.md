## RecyclerView 여러개의 ViewHolder를 사용하는 방법

> **1. _override fun getItemViewType(position: Int): Int_** 함수를 오버라이딩 해서 각각의 아이템에 대하여 다른 Int 값을 리턴한다.
> 
> **2. _override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder_** 함수에서 viewType(1번에서 리턴한 값)에 따라, 서로 다른 layout을 inflate 한 후, ViewHolder를 생성해서 리턴한다.
> 
> **3. _override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)_** 함수에서 ```holder.itemViewType``` 값에 따라, viewHolder에 데이터를 설정한다.

---

## 실행결과

![7_gif_30_percent](https://user-images.githubusercontent.com/58127442/153866972-6b65fcc3-fddb-472f-8675-1fc9560f59e4.gif)

---

## RecyclerView에서 여러개의 ViewHolder를 사용해야 하는 이유?

[Velog 게시글](https://velog.io/@kimbsu00/Android-7)을 확인해주세요 :)
