پکیج base:

یدونه کلاس Person داره که شامل اسم و کدملی هر فردی توی دانشگاه و لیست افراده.
توی متد Person این فیلد های مقدار دهی میشن و توی متد find چک میشه که این فرد توی لیست افراد موجوده یا خیر.
در صورت وجود مقدارش و در صورت نبود، null چاپ میشه.

پکیج uni:

کلاس Student:
فیلد آیدی، لیست دانشجویان، آیدی دانشجو، آیدی رشته‌ای که فرد داره و شماره دانشجویی فرد رو داراست.
متد Student: آیدی دانشجو، سالی که فرد به دانشگاه وارد شده، آیدی رشته‌ی دانشجو مقدار دهی میشه.
وقتی متد setStudentCode اد میشه شماره دانشجویی فرد ساخته میشه و چاپ میشه و همچنین تعداد دانشجویان افزایش پیدا می‌کنه.
متد findbyid مانند همین متد در کلاس Person، عمل می‌کنه.
شماره دانشجویی توی متد setStudentCode به این صورت ساخته میشه که اول سال ورودی دانشجو، سپس آیدی رشته و بعد از اون شماره دانشجویی فرد بطوری که مشخص می‌کنه چندمین دانشجوی رشته‌ی خودش هست چاپ میشه.

کلاس Major:
مربوط به رشته های موجود توی دانشگاست که فیلد های آیدی، اسم رشته، لیست رشته، ظرفیت رشته و تعداد دانشجویان رشته رو داراست.
متد Major:
اسم رشته، ظرفیت رشته و تعداد دانشجویان رشته مقدار دهی میشه.
متد findbyid: طوری عمل می‌کنه که رشته مورد نظر رو با استفاده از آیدی از لیست رشته ها پیدا می‌کنه و در صورتی که وجود نداشت null رو ریترن می‌کنه.
متد addstudent:
درصورتی که ظرفیت تکمیل نشده باشه دانشجو رو اضافه می‌کنه، در غیر این صورت پیام خطا چاپ می‌کنه.

کلاس Professor:
دارای فیلد های آیدی، آیدی رشته و آیدی فرد و لیست اساتید می‌باشد.
متد professor:
آیدی فرد، آیدی رشته مقدار دهی میشه.
متد findbyid:
همون طور که در کلاس های قبلی ازش استفاده شد، کاربرد داره.

کلاس course:
دارای آیدی، لیست درس، عنوان و تعداد واحد های درس می‌باشد.
متد course: عنوان درس و واحد ها مقدار دهی میشه و لیست دروس اضافه میشه.
متد findbyid: مثل کلاس های کاربرد داره که درس موردنظر رو با استفاده از ایدیش توی لیست دروس پیدا می‌کنه.

کلاس presented course:
دارای آیدی درس ارائه شده، لیست درس های ارائه شده، آیدی استادی که درس رو ارائه میده، ظرفیت درس، و لیست دانشجوهایی که این درس رو برداشتن می‌باشد.
متد presentedCourse: آیدی درس، آیدی استاد و ظرفیت کلاس مقداردهی میشه. یک لیست خالی برای دانشجویانی که این درس رو برمیدارن ساخته میشه.
متد findbyid: مانند متد findbyid کلاس ها قبلی عمل می‌کنه.
متد addstudent: چک می‌کنه درصورتیکه ظرفیت کلاس به حداکثر نرسیده باشه، دانشجو رو به کلاس اضافه می‌کنه و آیدیشو توی لیست قرار میده.

کلاس Transcript:
دارای فیلد آیدی دانشجو و hashmap کارنامه می‌باشد.
متد Transcript: آیدی دانشجو مقداردهی میشه.
یک لیست خالی کارنامه برای دانشجو ساخته میشه.
متد setGrade: آیدی درس ارائه شده و نمره‌ی اون درس رو توی کارنامه قرار میده.
متد print transcript: نمرات مربوط به هر دانشجو رو چاپ می‌کنه.
درصورت نبود درس ارائه شده پیام خطا چاپ می‌کنه.
متد getGPA: معدل وزنی دانشجو رو حساب می‌کنه به طوری که با استفاده از تعداد واحد های هر درس محاسبه میشه.



