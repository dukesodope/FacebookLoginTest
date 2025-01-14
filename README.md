Trần Trung Đức - 22ITSE1 - BIT220204
# Facebook Login Test

Dự án này chứa các kịch bản kiểm thử tự động để kiểm tra chức năng đăng nhập của Facebook sử dụng Selenium WebDriver. Mục tiêu của dự án là kiểm tra nhiều tình huống khác nhau như đăng nhập thành công, đăng nhập thất bại và xác minh thông báo lỗi.

## Tính Năng

- Kiểm thử tự động chức năng đăng nhập của Facebook.
- Kiểm tra:
  - Đăng nhập thành công với thông tin hợp lệ.
  - Thông báo lỗi khi đăng nhập thất bại.
  - Các thành phần giao diện trên trang đăng nhập.
- Kịch bản được viết bằng **Java** với **Selenium WebDriver**.
- Tích hợp **TestNG** để thực thi và báo cáo kết quả kiểm thử.

---

## Yêu Cầu Trước Khi Sử Dụng

Hãy đảm bảo bạn đã cài đặt các công cụ và thư viện sau:

1. **Java Development Kit (JDK)** (phiên bản 8 trở lên)
2. **Maven** (để quản lý thư viện)
3. **ChromeDriver** hoặc WebDriver phù hợp với trình duyệt bạn đang sử dụng
4. **Git** (để clone mã nguồn)

---

## Hướng Dẫn Cài Đặt

1. Clone dự án:
```bash
  https://github.com/dukesodope/FacebookLoginTest.git
  cd FacebookLoginTest
```
2. Import dự án vào IDE bạn sử dụng (ví dụ: IntelliJ IDEA, Eclipse)
3. Cấu hình thư viện cần thiết: Maven sẽ tự động tải về các thư viện được khai báo trong tệp `pom.xml`.
4. Tải về WebDriver phù hợp:
- Đối với Chrome: ChromeDriver
- Đặt driver trong PATH của hệ thống hoặc cập nhật đường dẫn trong mã nguồn

## Cách sử dụng
1. Cập nhật tệp test.properties với thông tin của bạn:
```bash
browser=chrome
driverPath=path/to/chromedriver
username=email_facebook_cua_ban
password=mat_khau_facebook_cua_ban
```
2. Chạy các trường hợp kiểm thử sử dụng Maven:
```bash
mvn clean test
```
## Cấu trúc dự án
    FacebookLoginTest/
    ├── src/
    │   ├── main/
    │   │   └── java/
    │   │       └── facebook/
    │   │           ├── utils/                 
    │   │           │   └── DriverSetup.java WebDriver
    │   │           └── tests/                
    │   │               └── LoginTest.java   
    │   └── test/
    │       └── java/                      
    ├── pom.xml                              
    └── README.md                           
## Các Trường Hợp Kiểm Thử
1. **Đăng Nhập Thành Công**
- Điều kiện đầu tiên: Tên đăng nhập và mật khẩu hợp lệ.
Các bước:
- Truy cập trang đăng nhập Facebook.
- Nhập thông tin đăng nhập hợp lệ.
- Nhấn nút đăng nhập.
- Kết quả mong đợi: Người dùng được chuyển đến trang chủ Facebook.
2. **Đăng Nhập Thất Bại**
- Điều kiện đầu tiên: Tên đăng nhập hoặc mật khẩu không hợp lệ.
Các bước:
- Truy cập trang đăng nhập Facebook.
- Nhập thông tin đăng nhập không hợp lệ.
- Nhấn nút đăng nhập.
- Kết quả mong đợi: Thông báo lỗi được hiển thị.
3. **Thông Tin Đăng Nhập Bị Thiếu**
- Điều kiện đầu tiên: Trường tên đăng nhập hoặc mật khẩu bị để trống.
Các bước:
- Truy cập trang đăng nhập Facebook.
- Để trống trường tên đăng nhập hoặc mật khẩu.
- Nhấn nút đăng nhập.
- Kết quả mong đợi: Hiển thị thông báo yêu cầu nhập đầy đủ thông tin.
## Công Nghệ Sử Dụng
- **Ngôn Ngữ Lập Trình**: Java
- **Framework Kiểm Thử**: TestNG
- **Công Cụ Tự Động Hóa**: Selenium WebDriver
- **Công Cụ Xây Dựng**: Maven
## Kết quả


## Đóng Góp
Mọi đóng góp đều được hoan nghênh! Hãy thực hiện các bước sau:

1. Fork repository này.
2. Tạo một nhánh mới:
```bash
git checkout -b feature-ten-nhanh-moi
```
3. Commit thay đổi:
```bash
git commit -m "Thêm mô tả ý nghĩa thay đổi"
```
4.Push lên nhánh:
```bash
git push origin feature-ten-nhanh-moi
```
5. Tạo Pull Request.
## Liên Hệ
Nếu có bất kỳ câu hỏi hoặc vấn đề nào, vui lòng tạo issue trong repository hoặc liên hệ với chủ sở hữu repository.

Chúc bạn kiểm thử thành công! 🎉
