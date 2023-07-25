object CaesarCipher {

  def caesarEncrypt(plainText: String, shift: Int): String = {
    val encryptedText = plainText.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val shiftedChar = (char.toUpper.toInt + shift - 'A'.toInt) % 26 + 'A'.toInt
        if (isUpper) shiftedChar.toChar else shiftedChar.toChar.toLower
      } else {
        char
      }
    }
    encryptedText.mkString
  }

  def caesarDecrypt(cipherText: String, shift: Int): String = {
    val decryptedText = cipherText.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val shiftedChar = (char.toUpper.toInt - shift - 'A'.toInt + 26) % 26 + 'A'.toInt
        if (isUpper) shiftedChar.toChar else shiftedChar.toChar.toLower
      } else {
        char
      }
    }
    decryptedText.mkString
  }

  def cipher(operation: String, text: String, shift: Int): String = {
    operation match {
      case "encrypt" => caesarEncrypt(text, shift)
      case "decrypt" => caesarDecrypt(text, shift)
      case _ => throw new IllegalArgumentException("Invalid operation. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    val plainText = "Hello, world!"
    val shiftValue = 3

    // Encrypt the plain text using Caesar cipher
    val encryptedText = cipher("encrypt", plainText, shiftValue)
    println(s"Encrypted: $encryptedText")

    // Decrypt the encrypted text using Caesar cipher
    val decryptedText = cipher("decrypt", encryptedText, shiftValue)
    println(s"Decrypted: $decryptedText")
  }
}
