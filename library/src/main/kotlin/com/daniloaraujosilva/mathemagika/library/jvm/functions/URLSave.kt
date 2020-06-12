package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLSave
 *
 * Full name:        System`URLSave
 *
 * Usage:            URLSave[url, file, elements] return elements from url for any accessible URL, and store the content in file.
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
 *                   ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 * Options:          BinaryFormat -> True
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLSave.html
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
fun uRLSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLSave", arguments.toMutableList(), options)
}
