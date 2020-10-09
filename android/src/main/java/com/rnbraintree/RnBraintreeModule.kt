package com.rnbraintree

import com.braintreepayments.api.BraintreeFragment
import com.braintreepayments.api.exceptions.InvalidArgumentException
import com.facebook.react.bridge.*
import java.lang.Exception

class RnBraintreeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  private lateinit var braintreeFragment: BraintreeFragment
  private lateinit var token: String

  val PAYMENT_REQUEST = 35565

  override fun getName(): String {
    return "RnBraintree"
  }

  // Example method
  // See https://facebook.github.io/react-native/docs/native-modules-android
  @ReactMethod
  fun multiply(a: Int, b: Int, promise: Promise) {
    promise.resolve(a * b)
  }

  @ReactMethod
  fun setupBT(token: String, promise: Promise) {
    try {
      this.token = token
      promise.resolve("Hi ths is resolved")
//      throw (InvalidArgumentException("Kya Baat Hai"))
    } catch (e: InvalidArgumentException) {
      promise.reject(e)
    }
  }
}
