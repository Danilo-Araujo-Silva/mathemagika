package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLFetch
 *
 * Full name:        System`URLFetch
 *
 * Usage:            URLFetch[url, elements] return elements from url, for any accessible URL.
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
 *                   DisplayProxyDialog -> True
 *                   OAuthAuthentication -> None
 *                   FollowRedirects -> True
 *                   ProxyUsername ->
 *                   ProxyPassword ->
 *                   Debug -> False
 * Options:          ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLFetch
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLFetch.html
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
fun uRLFetch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLFetch", arguments.toMutableList(), options)
}
