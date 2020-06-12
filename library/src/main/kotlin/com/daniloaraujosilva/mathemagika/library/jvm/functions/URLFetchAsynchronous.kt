package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLFetchAsynchronous
 *
 * Full name:        System`URLFetchAsynchronous
 *
 * Usage:            URLFetchAsynchronous[url, eventFunction] asynchronously connect to a URL
 *
 *                   Method -> GET
 *                   Parameters -> {}
 *                   Body ->
 *                   MultipartElements -> {}
 *                   VerifyPeer -> True
 *                   Username -> None
 *                   Password -> None
 *                   UserAgent -> Automatic
 *                   CookieFunction -> Automatic
 *                   Cookies -> Automatic
 *                   StoreCookies -> True
 *                   Headers -> {}
 *                   CredentialsProvider -> Automatic
 *                   ConnectTimeout -> 0
 *                   ReadTimeout -> 0
 *                   OAuthAuthentication -> None
 *                   FollowRedirects -> True
 *                   ProxyUsername ->
 *                   ProxyPassword ->
 *                   Debug -> False
 *                   ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 *                   DisplayProxyDialog -> False
 *                   Progress -> False
 *                   Transfer -> Automatic
 *                   UserData -> None
 * Options:          Events -> Automatic
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLFetchAsynchronous
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLFetchAsynchronous.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun uRLFetchAsynchronous(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLFetchAsynchronous", arguments.toMutableList(), options)
}
