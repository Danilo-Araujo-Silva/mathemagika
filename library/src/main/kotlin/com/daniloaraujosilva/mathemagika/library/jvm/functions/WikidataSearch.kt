package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WikidataSearch
 *
 * Full name:        System`WikidataSearch
 *
 *                   WikidataSearch["keywords"] returns a list of Wikidata items whose labels include the given keywords.
 * Usage:            WikidataSearch["type"  "keywords"] returns a list of Wikidata identifiers of the specified type.
 *
 *                   Language :> $Language
 *                   MaxItems -> 10
 * Options:          SearchEndpoint -> https://www.wikidata.org/w/api.php
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WikidataSearch
 * Documentation:    web: http://reference.wolfram.com/language/ref/WikidataSearch.html
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
fun wikidataSearch(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WikidataSearch", arguments.toMutableList(), options)
}
