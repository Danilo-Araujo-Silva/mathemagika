package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WikipediaSearch
 *
 * Full name:        System`WikipediaSearch
 *
 *                   WikipediaSearch[keywords] returns a list of Wikipedia articles whose titles include the given keywords.
 *                   WikipediaSearch["Title"  keywords, options] returns a list of Wikipedia articles whose titles include the given keywords.
 *                   WikipediaSearch["Category"  keywords, options] returns a list of Wikipedia categories whose titles include the given keywords.
 *                   WikipediaSearch["Content"  keywords] returns a list of Wikipedia articles whose content includes the given keywords.
 * Usage:            WikipediaSearch[loc] returns a list of Wikipedia articles whose associated coordinates are near the given location.
 *
 *                   Language :> $Language
 *                   MaxItems -> Automatic
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WikipediaSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/WikipediaSearch.html
 *
 *                   WikipediaSearch[___] := (Message[WikipediaSearch::offline]; $Failed) /;  !PacletManager`$AllowInternet
 * Definitions:      WikipediaSearch[WikipediaData`Private`args___] := Module[{WikipediaData`Private`res = Catch[WikipediaData`Private`wikipediasearch0[WikipediaData`Private`args]]}, WikipediaData`Private`res /;  !FailureQ[WikipediaData`Private`res]]
 *
 * Own values:       None
 *
 *                   WikipediaSearch[___] := (Message[WikipediaSearch::offline]; $Failed) /;  !PacletManager`$AllowInternet
 * Down values:      WikipediaSearch[WikipediaData`Private`args___] := Module[{WikipediaData`Private`res = Catch[WikipediaData`Private`wikipediasearch0[WikipediaData`Private`args]]}, WikipediaData`Private`res /;  !FailureQ[WikipediaData`Private`res]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun wikipediaSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WikipediaSearch", arguments.toMutableList(), options)
}
