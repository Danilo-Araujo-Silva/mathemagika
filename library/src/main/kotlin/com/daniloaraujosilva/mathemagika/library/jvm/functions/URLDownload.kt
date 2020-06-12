package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLDownload
 *
 * Full name:        System`URLDownload
 *
 *                   URLDownload[url] downloads the content of the specified URL to a local temporary file.
 *                   URLDownload[{url , url , …}] downloads the contents of the specified URLs to files in a local temporary directory.
 *                                   1     2
 *                   URLDownload[url, file] downloads to a specified file.
 *                   URLDownload[{url , url , …}, dir] downloads to a specified directory.
 *                                   1     2
 *                   URLDownload[{req , req , …}, …] downloads the results of the list of HTTP requests.
 * Usage:                            1     2
 *
 *                   Authentication -> Automatic
 *                   ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 *                   CookieFunction -> Automatic
 *                   CreateIntermediateDirectories -> False
 *                   FollowRedirects -> True
 *                   Interactive -> True
 *                   TimeConstraint -> Infinity
 * Options:          VerifySecurityCertificates -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLDownload
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLDownload.html
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
fun uRLDownload(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLDownload", arguments.toMutableList(), options)
}
