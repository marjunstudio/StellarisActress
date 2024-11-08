package to.msn.wings.stellarisactress

import java.time.LocalDate

/**
* APIで取得する女優データクラス
 * @property id 女優ID
 * @property name 女優名
 * @property ruby 女優名の読み仮名
 * @property bust バストサイズ
 * @property cup カップ数
 * @property waist ウエスト
 * @property hip ヒップ
 * @property height 身長
 * @property birthday 生年月日
 * @property bloodType 血液型
 * @property hobby 趣味
 * @property prefectures 出身地
 * @property imageUrl 画像URL
 */

data class Actress(
    val id: Int,
    val name: String,
    val ruby: String,
    val bust: Int,
    val cup: String,
    val waist: Int,
    val hip: Int,
    val height: Int,
    val birthday: LocalDate,
    val bloodType: String,
    val hobby: String,
    val prefectures: String,
    val imageUrl: String,
)
