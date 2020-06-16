package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Snippet
 *
 * Full name:        System`Snippet
 *
 *                   Snippet[doc] gives a snippet of text from a document or other content object.
 *                   Snippet[doc, n] gives about n lines from the beginning.
 *                   Snippet[doc, -n] gives about n lines from the end.
 *                   Snippet[doc, n  ;; n ] gives a span from lines n  to n
 *                                 1     2                           1     2
 *                   Snippet[doc, n  ;; n  ;; n ] gives a span from lines n  to n  in steps of n .
 *                                 1     2     3                           1     2              3
 * Usage:            Snippet[ContentObject[…], SearchResultObject[…]] gives contextual snippets from a content object based on search results.
 *
 *                   Language :> $Language
 * Options:          PageWidth -> 80
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Snippet
 * Documentation:    web: http://reference.wolfram.com/language/ref/Snippet.html
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
fun snippet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Snippet", arguments.toMutableList(), options)
}
