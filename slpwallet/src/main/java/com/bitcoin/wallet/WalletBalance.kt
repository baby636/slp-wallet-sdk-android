package com.bitcoin.wallet

import com.bitcoin.wallet.slp.SlpTokenDetails
import java.math.BigDecimal

/**
 * @author akibabu
 */
internal data class WalletBalance(val nativeBalance: Long, val tokenBalance: Map<SlpTokenDetails, BigDecimal>)