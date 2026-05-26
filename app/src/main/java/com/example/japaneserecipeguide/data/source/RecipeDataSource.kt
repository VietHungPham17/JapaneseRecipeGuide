package com.example.japaneserecipeguide.data.source

import com.example.japaneserecipeguide.data.model.*
import com.example.japaneserecipeguide.R
object RecipeDataSource {
    val recipes = listOf(
        Recipe(
            id = 1,
            name = "Miso Soup",
            nameJp = "味噌汁",
            category = Category.SOUP,
            difficulty = Difficulty.EASY,
            prepTimeMinutes = 5,
            cookTimeMinutes = 10,
            servings = 2,
            imageRes = R.drawable.miso_soup,
            description = "Canh miso truyền thống với đậu phụ và rong biển wakame.",
            ingredients = listOf(
                Ingredient("Nước dashi", "500ml"),
                Ingredient("Miso trắng", "2 muỗng canh"),
                Ingredient("Đậu phụ non", "150g"),
                Ingredient("Rong biển wakame khô", "5g"),
                Ingredient("Hành lá", "2 nhánh")
            ),
            steps = listOf(
                "Ngâm rong biển wakame trong nước lạnh 5 phút, sau đó vắt ráo.",
                "Đun nước dashi đến gần sôi (khoảng 80°C), không để sôi mạnh.",
                "Cắt đậu phụ thành hình vuông nhỏ 2cm, cho vào nồi.",
                "Hòa miso vào một ít nước dashi, sau đó đổ vào nồi, khuấy nhẹ.",
                "Thêm rong biển, tắt bếp ngay. Không đun sôi sau khi cho miso.",
                "Múc ra bát, rắc hành lá thái nhỏ lên trên."
            )
        ),
        Recipe(
            id = 2,
            name = "Tonkatsu",
            nameJp = "豚カツ",
            category = Category.MAIN,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 2,
            imageRes = R.drawable.tonkatsu,
            description = "Thịt heo tẩm breadcrumb chiên giòn, ăn kèm cơm trắng và sốt tonkatsu.",
            ingredients = listOf(
                Ingredient("Thịt heo thăn", "300g (2 miếng)"),
                Ingredient("Bột mì đa dụng", "3 muỗng canh"),
                Ingredient("Trứng", "1 quả"),
                Ingredient("Panko", "100g"),
                Ingredient("Muối & tiêu", "vừa đủ"),
                Ingredient("Dầu chiên", "500ml")
            ),
            steps = listOf(
                "Dùng chày đập nhẹ thịt cho mềm, khía nhẹ phần viền.",
                "Ướp thịt với muối và tiêu, để nghỉ 5 phút.",
                "Lăn thịt qua bột mì → trứng → panko.",
                "Đun dầu đến 170°C, chiên 4 phút mỗi mặt.",
                "Vớt ra để ráo dầu trên giấy thấm.",
                "Cắt thành miếng vừa ăn, dọn với sốt tonkatsu."
            )
        ),
        Recipe(
            id = 3,
            name = "Onigiri",
            nameJp = "おにぎり",
            category = Category.RICE,
            difficulty = Difficulty.EASY,
            prepTimeMinutes = 20,
            cookTimeMinutes = 0,
            servings = 4,
            imageRes = R.drawable.onigiri,
            description = "Cơm nắm tam giác với nhân cá hồi, bọc rong biển nori.",
            ingredients = listOf(
                Ingredient("Cơm Nhật nấu chín", "400g"),
                Ingredient("Cá hồi nướng", "100g"),
                Ingredient("Nori", "4 tờ"),
                Ingredient("Muối", "1 muỗng cà phê"),
                Ingredient("Mè rang", "1 muỗng canh")
            ),
            steps = listOf(
                "Cá hồi nướng chín, tách thành mảnh nhỏ, trộn với mè rang.",
                "Nhúng tay vào nước, xoa một chút muối.",
                "Lấy 100g cơm, tạo hình chén trong lòng bàn tay.",
                "Đặt nhân cá hồi vào giữa, bọc cơm lại.",
                "Nặn thành hình tam giác.",
                "Bọc nori quanh phần đáy tam giác."
            )
        ),
        Recipe(
            id = 4,
            name = "Ramen",
            nameJp = "ラーメン",
            category = Category.RICE,
            difficulty = Difficulty.HARD,
            prepTimeMinutes = 30,
            cookTimeMinutes = 180,
            servings = 2,
            imageRes = R.drawable.ramen,
            description = "Mì ramen nước dùng tonkotsu đậm đà, với chashu heo, trứng lòng đào và nori.",
            ingredients = listOf(
                Ingredient("Mì ramen tươi", "200g"),
                Ingredient("Xương heo", "500g"),
                Ingredient("Thịt ba chỉ heo", "300g"),
                Ingredient("Trứng", "2 quả"),
                Ingredient("Nori", "2 tờ"),
                Ingredient("Hành lá", "3 nhánh"),
                Ingredient("Tỏi", "4 tép"),
                Ingredient("Gừng", "1 nhánh nhỏ"),
                Ingredient("Xì dầu", "3 muỗng canh"),
                Ingredient("Mirin", "2 muỗng canh")
            ),
            steps = listOf(
                "Chần xương heo qua nước sôi 5 phút, rửa sạch.",
                "Hầm xương với 2 lít nước, tỏi, gừng trong 3 tiếng.",
                "Ướp thịt ba chỉ với xì dầu, mirin, đường, cuộn chặt và buộc dây.",
                "Nấu chashu trong nước dashi 1 tiếng đến khi mềm.",
                "Luộc trứng 7 phút, ngâm trong nước xì dầu qua đêm.",
                "Trụng mì trong nước sôi 2 phút, vớt ra bát.",
                "Chan nước dùng nóng, xếp chashu, trứng, nori và hành lá lên trên."
            )
        ),
        Recipe(
            id = 5,
            name = "Takoyaki",
            nameJp = "たこ焼き",
            category = Category.MAIN,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 20,
            cookTimeMinutes = 15,
            servings = 4,
            imageRes = R.drawable.takoyaki,
            description = "Bánh bạch tuộc nướng hình cầu, đặc sản đường phố Osaka nổi tiếng.",
            ingredients = listOf(
                Ingredient("Bột takoyaki (hoặc bột mì)", "200g"),
                Ingredient("Bạch tuộc luộc", "150g"),
                Ingredient("Trứng", "2 quả"),
                Ingredient("Nước dashi", "400ml"),
                Ingredient("Hành lá thái nhỏ", "50g"),
                Ingredient("Tenkasu (vụn tempura)", "30g"),
                Ingredient("Sốt takoyaki", "để ăn kèm"),
                Ingredient("Mayonnaise Nhật", "để ăn kèm"),
                Ingredient("Katsuobushi", "để trang trí")
            ),
            steps = listOf(
                "Trộn bột với trứng và nước dashi thành hỗn hợp lỏng mịn.",
                "Đun nóng khuôn takoyaki, phết dầu đều các lỗ.",
                "Đổ bột vào đầy các lỗ khuôn.",
                "Cho bạch tuộc, hành lá, tenkasu vào từng lỗ.",
                "Dùng que lật tròn bánh liên tục để tạo hình cầu.",
                "Nướng đến khi vàng đều, rưới sốt takoyaki và mayo lên trên.",
                "Rắc katsuobushi và rong biển bột trước khi ăn."
            )
        ),
        Recipe(
            id = 6,
            name = "Sushi Cuộn",
            nameJp = "巻き寿司",
            category = Category.RICE,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 40,
            cookTimeMinutes = 0,
            servings = 4,
            imageRes = R.drawable.sushi,
            description = "Cơm sushi cuộn với cá hồi, bơ và dưa leo, chấm wasabi và xì dầu.",
            ingredients = listOf(
                Ingredient("Cơm Nhật", "300g"),
                Ingredient("Giấm gạo", "3 muỗng canh"),
                Ingredient("Đường", "1 muỗng canh"),
                Ingredient("Muối", "1 muỗng cà phê"),
                Ingredient("Nori", "4 tờ"),
                Ingredient("Cá hồi tươi", "200g"),
                Ingredient("Bơ", "1 quả"),
                Ingredient("Dưa leo", "1 quả"),
                Ingredient("Wasabi & xì dầu", "để ăn kèm")
            ),
            steps = listOf(
                "Nấu cơm Nhật, trộn với hỗn hợp giấm gạo, đường, muối khi còn nóng.",
                "Để cơm nguội bớt, quạt cho bóng.",
                "Đặt nori lên tấm tre (makisu), trải cơm đều lên 2/3 tờ nori.",
                "Xếp cá hồi, bơ, dưa leo theo hàng ngang ở giữa.",
                "Cuộn chặt từ phía gần mình ra ngoài, ép nhẹ tay.",
                "Cắt thành khoanh dày 2cm bằng dao ướt.",
                "Dọn với wasabi và xì dầu."
            )
        ),
        Recipe(
            id = 7,
            name = "Tempura Tôm",
            nameJp = "海老天ぷら",
            category = Category.MAIN,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 20,
            cookTimeMinutes = 15,
            servings = 2,
            imageRes = R.drawable.tempura,
            description = "Tôm chiên bột tempura giòn tan, ăn kèm nước chấm tentsuyu.",
            ingredients = listOf(
                Ingredient("Tôm sú", "8 con"),
                Ingredient("Bột tempura", "100g"),
                Ingredient("Nước lạnh", "150ml"),
                Ingredient("Dầu chiên", "500ml"),
                Ingredient("Nước dashi", "200ml"),
                Ingredient("Mirin", "2 muỗng canh"),
                Ingredient("Xì dầu", "2 muỗng canh"),
                Ingredient("Củ cải trắng bào", "50g")
            ),
            steps = listOf(
                "Bóc vỏ tôm, giữ lại đuôi. Khía lưng tôm và duỗi thẳng.",
                "Trộn bột tempura với nước lạnh — không khuấy kỹ, để còn vón cục nhỏ.",
                "Đun dầu đến 180°C.",
                "Nhúng tôm vào bột, thả vào dầu chiên 2-3 phút đến khi vàng giòn.",
                "Vớt ra giấy thấm dầu.",
                "Pha nước chấm tentsuyu từ dashi, mirin, xì dầu.",
                "Dọn tôm tempura với củ cải bào và nước chấm."
            )
        ),
        Recipe(
            id = 8,
            name = "Gyoza",
            nameJp = "餃子",
            category = Category.MAIN,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 40,
            cookTimeMinutes = 15,
            servings = 4,
            imageRes = R.drawable.gyoza,
            description = "Há cảo chiên kiểu Nhật, vỏ giòn đáy vàng, nhân thịt heo và cải thảo.",
            ingredients = listOf(
                Ingredient("Vỏ gyoza", "30 cái"),
                Ingredient("Thịt heo xay", "200g"),
                Ingredient("Cải thảo", "150g"),
                Ingredient("Hành lá", "3 nhánh"),
                Ingredient("Tỏi băm", "2 tép"),
                Ingredient("Gừng băm", "1 muỗng cà phê"),
                Ingredient("Xì dầu", "1 muỗng canh"),
                Ingredient("Dầu mè", "1 muỗng cà phê")
            ),
            steps = listOf(
                "Thái nhỏ cải thảo, rắc muối, bóp và vắt ráo nước.",
                "Trộn thịt heo xay với cải thảo, hành lá, tỏi, gừng, xì dầu, dầu mè.",
                "Đặt 1 muỗng nhân vào giữa vỏ gyoza.",
                "Gấp vỏ lại, nhéo kỹ mép tạo nếp gấp đặc trưng.",
                "Đun chảo với 1 muỗng canh dầu, xếp gyoza vào chiên đáy vàng.",
                "Đổ 50ml nước vào, đậy nắp hấp 5 phút đến khi cạn nước.",
                "Mở nắp chiên thêm 1 phút cho giòn đáy, dọn với nước chấm."
            )
        ),
        Recipe(
            id = 9,
            name = "Matcha Pudding",
            nameJp = "抹茶プリン",
            category = Category.DESSERT,
            difficulty = Difficulty.EASY,
            prepTimeMinutes = 15,
            cookTimeMinutes = 30,
            servings = 4,
            imageRes = R.drawable.matcha_pudding,
            description = "Bánh flan matcha mềm mịn, vị trà xanh đặc trưng, thanh mát.",
            ingredients = listOf(
                Ingredient("Bột matcha", "2 muỗng canh"),
                Ingredient("Sữa tươi", "400ml"),
                Ingredient("Kem tươi", "100ml"),
                Ingredient("Đường", "60g"),
                Ingredient("Gelatin", "10g"),
                Ingredient("Nước", "50ml")
            ),
            steps = listOf(
                "Ngâm gelatin trong nước lạnh 5 phút cho nở.",
                "Hòa bột matcha với một ít sữa nóng thành hỗn hợp mịn.",
                "Đun sữa và kem với đường đến khi tan hết đường.",
                "Cho gelatin vào hỗn hợp sữa nóng, khuấy đến khi tan.",
                "Thêm hỗn hợp matcha vào, khuấy đều.",
                "Rót vào khuôn, để nguội rồi cho vào tủ lạnh ít nhất 2 tiếng.",
                "Lấy ra khỏi khuôn, trang trí với kem tươi đánh bông."
            )
        ),
        Recipe(
            id = 10,
            name = "Udon Xào",
            nameJp = "焼きうどん",
            category = Category.RICE,
            difficulty = Difficulty.EASY,
            prepTimeMinutes = 10,
            cookTimeMinutes = 15,
            servings = 2,
            imageRes = R.drawable.udon,
            description = "Mì udon xào với rau củ và thịt bò, sốt xì dầu đậm đà.",
            ingredients = listOf(
                Ingredient("Mì udon tươi", "400g"),
                Ingredient("Thịt bò thái mỏng", "150g"),
                Ingredient("Bắp cải", "100g"),
                Ingredient("Cà rốt", "1/2 củ"),
                Ingredient("Hành tây", "1/2 củ"),
                Ingredient("Xì dầu", "3 muỗng canh"),
                Ingredient("Mirin", "1 muỗng canh"),
                Ingredient("Dầu mè", "1 muỗng cà phê")
            ),
            steps = listOf(
                "Thái bắp cải, cà rốt, hành tây thành sợi vừa ăn.",
                "Đun chảo nóng với dầu ăn, xào thịt bò đến khi chín.",
                "Cho rau củ vào xào cùng 2-3 phút.",
                "Thêm mì udon vào, dùng đũa gỡ mì tơi ra.",
                "Cho xì dầu, mirin vào, xào đều trên lửa lớn.",
                "Rưới dầu mè, trộn đều và tắt bếp.",
                "Dọn ra đĩa, rắc katsuobushi và hành lá nếu thích."
            )
        ),
        Recipe(
            id = 11,
            name = "Okonomiyaki",
            nameJp = "お好み焼き",
            category = Category.MAIN,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 20,
            cookTimeMinutes = 20,
            servings = 2,
            imageRes = R.drawable.okonomiyaki,
            description = "Bánh xèo Nhật với bắp cải, tôm và sốt đặc trưng okonomiyaki.",
            ingredients = listOf(
                Ingredient("Bột mì", "100g"),
                Ingredient("Nước dashi", "150ml"),
                Ingredient("Trứng", "2 quả"),
                Ingredient("Bắp cải thái nhỏ", "200g"),
                Ingredient("Tôm", "100g"),
                Ingredient("Thịt ba chỉ thái mỏng", "100g"),
                Ingredient("Sốt okonomiyaki", "để ăn kèm"),
                Ingredient("Mayonnaise Nhật", "để ăn kèm"),
                Ingredient("Katsuobushi", "để trang trí")
            ),
            steps = listOf(
                "Trộn bột mì với nước dashi và trứng thành bột lỏng.",
                "Cho bắp cải và tôm vào trộn đều.",
                "Đun chảo với dầu, đổ hỗn hợp thành bánh tròn dày 2cm.",
                "Xếp thịt ba chỉ lên mặt bánh.",
                "Chiên lửa vừa 5 phút, lật mặt chiên thêm 5 phút.",
                "Phết sốt okonomiyaki và mayo lên mặt bánh.",
                "Rắc katsuobushi và rong biển bột, dọn ngay khi nóng."
            )
        ),
        Recipe(
            id = 12,
            name = "Chawanmushi",
            nameJp = "茶碗蒸し",
            category = Category.SOUP,
            difficulty = Difficulty.MEDIUM,
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 4,
            imageRes = R.drawable.chawanmushi,
            description = "Trứng hấp kiểu Nhật mềm mịn như tofu, với tôm, nấm và hạt bạch quả.",
            ingredients = listOf(
                Ingredient("Trứng", "3 quả"),
                Ingredient("Nước dashi", "400ml"),
                Ingredient("Xì dầu", "1 muỗng canh"),
                Ingredient("Mirin", "1 muỗng canh"),
                Ingredient("Muối", "1/2 muỗng cà phê"),
                Ingredient("Tôm", "4 con"),
                Ingredient("Nấm shiitake", "4 cái"),
                Ingredient("Hạt bạch quả (ginkgo)", "8 hạt")
            ),
            steps = listOf(
                "Đánh trứng nhẹ tay, không để bọt nổi.",
                "Trộn dashi, xì dầu, mirin, muối vào trứng, lọc qua rây.",
                "Xếp tôm, nấm shiitake, hạt bạch quả vào chén.",
                "Rót hỗn hợp trứng vào chén, đậy nắp hoặc bọc màng thực phẩm.",
                "Hấp cách thủy lửa nhỏ 15-18 phút — quan trọng: không để sôi mạnh.",
                "Kiểm tra bằng cách cắm tăm — rút ra sạch là chín.",
                "Dọn ngay khi còn nóng."
            )
        ),
        Recipe(
            id = 13,
            name = "Dorayaki",
            nameJp = "どら焼き",
            category = Category.DESSERT,
            difficulty = Difficulty.EASY,
            prepTimeMinutes = 15,
            cookTimeMinutes = 20,
            servings = 6,
            imageRes = R.drawable.dorayaki,
            description = "Bánh rán mật ong kẹp nhân đậu đỏ ngọt bùi — món tráng miệng yêu thích của Doraemon!",
            ingredients = listOf(
                Ingredient("Bột mì", "100g"),
                Ingredient("Trứng", "2 quả"),
                Ingredient("Đường", "60g"),
                Ingredient("Mật ong", "1 muỗng canh"),
                Ingredient("Baking soda", "1/2 muỗng cà phê"),
                Ingredient("Sữa", "2 muỗng canh"),
                Ingredient("Nhân đậu đỏ (anko)", "200g")
            ),
            steps = listOf(
                "Đánh trứng với đường và mật ong đến khi bông nhẹ.",
                "Hòa baking soda với sữa, thêm vào hỗn hợp trứng.",
                "Rây bột mì vào, khuấy nhẹ đến khi hỗn hợp mịn.",
                "Để bột nghỉ 15 phút.",
                "Đun chảo chống dính lửa nhỏ, đổ 2 muỗng bột thành hình tròn.",
                "Khi mặt trên nổi bọt, lật mặt nướng thêm 30 giây.",
                "Kẹp nhân đậu đỏ giữa 2 lớp bánh."
            )
        )
    )
}