package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             URLSaveAsynchronous
 *
 * Full name:        System`URLSaveAsynchronous
 *
 * Usage:            URLSaveAsynchronous[url, file, eventFunction] asynchronously connect to a URL, and store the content in a file.
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
 *                   BinaryFormat -> True
 *                   UserData -> None
 * Options:          Events -> Automatic
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLSaveAsynchronous
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLSaveAsynchronous.html
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
fun uRLSaveAsynchronous(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLSaveAsynchronous", arguments.toMutableList(), options)
}
