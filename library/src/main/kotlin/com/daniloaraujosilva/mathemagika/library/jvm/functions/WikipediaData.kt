package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WikipediaData
 *
 * Full name:        System`WikipediaData
 *
 *                   WikipediaData[article] gives the plain text of the specified Wikipedia article.
 *                   WikipediaData[article, property, options] gives the value of the specified property, modified by optional parameters, for the given Wikipedia article.
 *                   WikipediaData["Category"  category, property, options] gives the value of the specified property, modified by optional parameters, for the given Wikipedia category.
 * Usage:            WikipediaData["PageID"  pageid, property, options] gives the value of the specified property, modified by optional parameters, for the article corresponding to the given numerical Wikipedia page ID.
 *
 *                   GeoDisk -> Automatic
 *                   GeoDistance -> Automatic
 *                   Language :> $Language
 *                   MaxItems -> Automatic
 *                   MaxLevel -> Automatic
 * Options:          MaxLevelItems -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WikipediaData
 * Documentation:    web: http://reference.wolfram.com/language/ref/WikipediaData.html
 *
 *                   WikipediaData[___] := (Message[WikipediaData::offline]; $Failed) /;  !PacletManager`$AllowInternet
 * Definitions:      WikipediaData[WikipediaData`Private`args___] := Module[{WikipediaData`Private`res = Catch[WikipediaData`Private`wikipediadata0[WikipediaData`Private`args]]}, WikipediaData`Private`res /;  !FailureQ[WikipediaData`Private`res]]
 *
 * Own values:       None
 *
 *                   WikipediaData[___] := (Message[WikipediaData::offline]; $Failed) /;  !PacletManager`$AllowInternet
 * Down values:      WikipediaData[WikipediaData`Private`args___] := Module[{WikipediaData`Private`res = Catch[WikipediaData`Private`wikipediadata0[WikipediaData`Private`args]]}, WikipediaData`Private`res /;  !FailureQ[WikipediaData`Private`res]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun wikipediaData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WikipediaData", arguments.toMutableList(), options)
}
