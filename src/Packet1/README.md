Trong java :
- Ở trong "public static void main" có thể gọi tới class bao phủ
![img.png](img.png)
_Đoạn code sẽ in ra "Nhật"_

- Tương tự ở trong "public static void main" có thể tạo 1 lớp khác
![img_1.png](img_1.png)
- Một số thuộc tin của class trong java
![img_2.png](img_2.png)

# Tính kế thừa trong java
![img_3.png](img_3.png)
- ví dụ cụ thể
- ![img_4.png](img_4.png) ![img_5.png](img_5.png)
- Lớp cha là lớp person , lớp con là lơp Nhat
- Nếu khai báo lớp con mà không có thuộc tính của lớp cha thì thuộc tính mặc định là null
- Trường hợp method ở lớp con ghi đè lên thuộc tính ở lớp chả thì chạy hàm ở lớp con
- Còn không ghi đè thì chạy hàm ở lớp cha
- Lớp cha được tạo trước xong lớp con tạo , nếu trong construction cuả cả lớp cha và con đề có System.out.print(" ") thì in lớp cha trước, lớp con sau
# Biến trong class
![img_6.png](img_6.png)
- biến static chỉ dùng cho hàm static
- biến final chỉ khai báo được lần đầu tiên
- biến transient được dùng để không lưu trữ dữ liệu khi đối tượng của lớp đó được huyển đổi thành một chuỗi byte để lưu trữ hoặc truyền đi
- Ví dụ:
![img_7.png](img_7.png)
- 
Trong ví dụ trên:
    - transientVar sẽ không được lưu trữ khi đối tượng của MyClass được serialized, trong khi normalVar sẽ được serialized bình thường.
- biến volatile đảm bảo khả năng đồng bộ giá trị biến trên các luồng
Ví dụ : 
- ![img_8.png](img_8.png)
Biến count được khai báo là volatile 
![img_9.png](img_9.png)
- Lớp IncrementThread có 1 đối tượng là Counter
![img_10.png](img_10.png)
- Lớp PrintThread cũng có 1 đối tượng là Counter
![img_11.png](img_11.png)
- Đoạn code lớp AMain in ra![img_12.png](img_12.png)
+ Vậy khi khai báo biến volatile thì khi giá trị ở 1 thread thay đổi chũng làm thay đổi giá trị ở thread khác
- Access specifiers : public , protected, private,default
# Phương thức trong java
![img_13.png](img_13.png)
