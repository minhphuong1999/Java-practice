// ôn luyện java
Hãy thiết kế một hệ thống dựa trên mô hình thực tế sau:

Bạn cần xây dựng một chương trình quản lý diện tích các loại hình học. Chương trình sẽ yêu cầu người dùng nhập lựa chọn từ 1 đến 5:

- 1: Hình vuông
- 2: Hình chữ nhật
- 3: Hình tròn
- 4: Hình tam giác
- 5: Thoát chương trình

Chương trình sẽ yêu cầu nhập thông tin tương ứng với từng loại hình và sau đó tính và hiển thị diện tích của hình. Khi người dùng chọn 5, chương trình sẽ thoát.

**Yêu cầu:**

1. **Lớp `Shape`:**
    - Là lớp cơ sở, có một phương thức trừu tượng `getArea()` để tính diện tích.
2. **Lớp `Square` (kế thừa từ `Shape`):**
    - Thuộc tính: `side` (cạnh của hình vuông).
    - Phương thức: `getArea()` tính diện tích hình vuông (`side * side`).
3. **Lớp `Rectangle` (kế thừa từ `Shape`):**
    - Thuộc tính: `width` (chiều rộng) và `height` (chiều cao).
    - Phương thức: `getArea()` tính diện tích hình chữ nhật (`width * height`).
4. **Lớp `Circle` (kế thừa từ `Shape`):**
    - Thuộc tính: `radius` (bán kính).
    - Phương thức: `getArea()` tính diện tích hình tròn (`Math.PI * radius * radius`).
5. **Lớp `Triangle` (kế thừa từ `Shape`):**
    - Thuộc tính: `base` (đáy) và `height` (chiều cao).
    - Phương thức: `getArea()` tính diện tích tam giác (`(base * height) / 2`).
