# String trong java
![img.png](img.png)
- ví dụ :
![img_1.png](img_1.png)
- Lưu ý char ch[] = {"a","b"} sẽ bị lỗi mà phải dùng char[] ch = {'A', 'B'};
- >> Những phương thức trong lớp string
  > - charAt(int index) : lấy ra giá trị tại vị trí index
  > - startsWith(String prefix) : kiểm tra xem chuỗi có bắt đầu bằng prefix
  > - endsWith(String end) :kiểm tra xem chuỗi có kết thúc bằng end
  > - String.copyValueOf(char[] ch) : chuyển char[] thành chuỗi : String.copyValueOf(ch[])
  > - toCharArray() : chuyển chuỗi thàng char[]
  > - indexOf(char ch) : lấy ra vị trí của ch
  > - toUpperCase() : viết hoa tất cả
  > - toLowerCase() : viết thường tất cả
  > - trim() : bỏ khoảng trắng đầu cuối
  > - euquals() : so sánh 2 chuỗi
## Stringbuffer trong java
- >> append(String a) : nối chuỗi a vào chuỗi gốc
  > - ví dụ : 
  > ![img_2.png](img_2.png) 
  > - Kết quả trả về Hello world
- >> insert(int index,String a) : thêm chuỗi a vào vị trí index
  > - ví dụ :
  > ![img_3.png](img_3.png)
  > - Kết quả trả về Hi Hello
- >> charAt(int index) : trả về kí tự ở vị trí index
- >> setCharAt(int index, char a): thay đổi kí tự tại vị trí index thành a
  > - ví dụ : 
  > ![img_4.png](img_4.png)
  > - Lưu ý : là '' chứ không phải ""
- >> setLenght(index value): thay đổi giá trị độ dài chuỗi
  > - ví dụ :
  > ![img_5.png](img_5.png)
  > - Kết quả trả về Hel
- >> getChars(int srcBegin,int srcEnd,char[] ch,chBegin): sao chép chuỗi gốc từ srcBegin -> srcEnd lưu vào char[] ch từ vị trí chBegin
  > - ví dụ :
  > ![img_6.png](img_6.png)
- >> reverse() : đảo chuỗi

# Math trong java
![img_7.png](img_7.png)
- >> round() nếu > .5 thì làm tròn lên ngược lại thì làm tròn xuống
# Runtime trong java
![img_11.png](img_11.png)
- >> System.exit(int status) : ngắt chương trình đột ngột và trả về status
  > - ví dụ :
  > ![img_8.png](img_8.png)
  > - Kết quả in ra : Chương trình đang chạy...
- >> freeMemory() : lấy ra số lượng bộ nhớ trống đơn vị là bytes
  > - ví dụ :
  > ![img_9.png](img_9.png)
  > - getRuntime() : lấy 1 đối tượng Runtime
- >> totalMemory() : lấy ra tổng bộ nhớ đã cấp phát
  > - ví dụ :
  > ![img_10.png](img_10.png)
- >> System.gc() : thu gom rác
- >> exec(String command) : thực thi lệnh terminal
  > - ví dụ : Process process = Runtime.getRuntime().exec("ls -l");
  > - Thực thi lệnh "ls -l" để liệt kê các tập tin trong thư mục hiện tại (Unix/Linux)
  > - Lưu ý : exec() đã bị đánh dấu lỗi thời

# Lớp System trong java
![img_12.png](img_12.png)
- >> System.getPropertiess() ; System.setProperties() : lấy ra và thay đổi giá trị của các thuộc tính trong hệ thống
- >> currentTimeMillis() : lấy thời gian hiện tại dưới dạng mili giây
- >> arraCopy(srcObject,int srcBegin,targetObj, int targetBegin,int targetEnd): copy mảng này qua mảng khác
  > - ví dụ :
  > ![img_13.png](img_13.png)

# Lớp object trong java
![img_14.png](img_14.png)


