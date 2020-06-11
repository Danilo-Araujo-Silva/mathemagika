package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AddToSearchIndex
 *
 * Full name:        System`AddToSearchIndex
 *
 *                   AddToSearchIndex[obj, content] adds the specified content to the existing search index object obj.
 *                   AddToSearchIndex[obj, {content , …}] adds all the content  to obj.
 * Usage:                                          1                          i
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/AddToSearchIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/AddToSearchIndex.html
 *
 *                   AddToSearchIndex[(TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject)?TextSearch`PackageScope`fileIndexQ, ___] := (Message[AddToSearchIndex::invcoind]; $Failed)
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`content:_ContentObject | _Association, TextSearch`IndexUpdate`PackagePrivate`uniquenessField:_String | None, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, {TextSearch`IndexUpdate`PackagePrivate`content}, TextSearch`IndexUpdate`PackagePrivate`uniquenessField, TextSearch`IndexUpdate`PackagePrivate`opts]
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`content:_ContentObject | _Association, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, {TextSearch`IndexUpdate`PackagePrivate`content}, None, TextSearch`IndexUpdate`PackagePrivate`opts]
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`list:{(_ContentObject | _Association)...}, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, TextSearch`IndexUpdate`PackagePrivate`list, None, TextSearch`IndexUpdate`PackagePrivate`opts]
 * Definitions:      AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`list:{(_ContentObject | _Association)...}, TextSearch`IndexUpdate`PackagePrivate`uniquenessField:_String | None, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := Module[{TextSearch`IndexUpdate`PackagePrivate`handle, TextSearch`IndexUpdate`PackagePrivate`objs}, If[ !TextSearch`ValidSearchIndexObjectQ[TextSearch`IndexUpdate`PackagePrivate`obj], Message[AddToSearchIndex::invind, TextSearch`IndexUpdate`PackagePrivate`obj]; Return[$Failed]; ]; TextSearch`IndexUpdate`PackagePrivate`handle = TextSearch`PackageScope`createHandle[TextSearch`IndexUpdate`PackagePrivate`obj]; If[FailureQ[TextSearch`IndexUpdate`PackagePrivate`handle], Message[AddToSearchIndex::badind, TextSearch`IndexUpdate`PackagePrivate`obj]; Return[$Failed]]; TextSearch`IndexUpdate`PackagePrivate`objs = Replace[TextSearch`IndexUpdate`PackagePrivate`list, TextSearch`IndexUpdate`PackagePrivate`assoc_Association :> ContentObject[TextSearch`IndexUpdate`PackagePrivate`assoc], {1}]; If[ !VectorQ[TextSearch`IndexUpdate`PackagePrivate`objs, TextSearch`ValidContentObjectQ], Message[AddToSearchIndex::invco]; Return[$Failed]]; Scan[Function[TextSearch`IndexUpdate`PackagePrivate`content, TextSearch`PackageScope`dAddToIndex[TextSearch`IndexUpdate`PackagePrivate`handle, TextSearch`IndexUpdate`PackagePrivate`content, TextSearch`IndexUpdate`PackagePrivate`uniquenessField /. TextSearch`IndexUpdate`PackagePrivate`f_String :> {TextSearch`IndexUpdate`PackagePrivate`f, TextSearch`IndexUpdate`PackagePrivate`content[TextSearch`IndexUpdate`PackagePrivate`f]}, Sequence @@ FilterRules[{TextSearch`IndexUpdate`PackagePrivate`opts}, Options[TextSearch`PackageScope`dAddToIndex]]]], TextSearch`IndexUpdate`PackagePrivate`objs]; ]
 *
 * Own values:       None
 *
 *                   AddToSearchIndex[(TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject)?TextSearch`PackageScope`fileIndexQ, ___] := (Message[AddToSearchIndex::invcoind]; $Failed)
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`content:_ContentObject | _Association, TextSearch`IndexUpdate`PackagePrivate`uniquenessField:_String | None, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, {TextSearch`IndexUpdate`PackagePrivate`content}, TextSearch`IndexUpdate`PackagePrivate`uniquenessField, TextSearch`IndexUpdate`PackagePrivate`opts]
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`content:_ContentObject | _Association, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, {TextSearch`IndexUpdate`PackagePrivate`content}, None, TextSearch`IndexUpdate`PackagePrivate`opts]
 *                   AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`list:{(_ContentObject | _Association)...}, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj, TextSearch`IndexUpdate`PackagePrivate`list, None, TextSearch`IndexUpdate`PackagePrivate`opts]
 * Down values:      AddToSearchIndex[TextSearch`IndexUpdate`PackagePrivate`obj_SearchIndexObject, TextSearch`IndexUpdate`PackagePrivate`list:{(_ContentObject | _Association)...}, TextSearch`IndexUpdate`PackagePrivate`uniquenessField:_String | None, TextSearch`IndexUpdate`PackagePrivate`opts:OptionsPattern[]] := Module[{TextSearch`IndexUpdate`PackagePrivate`handle, TextSearch`IndexUpdate`PackagePrivate`objs}, If[ !TextSearch`ValidSearchIndexObjectQ[TextSearch`IndexUpdate`PackagePrivate`obj], Message[AddToSearchIndex::invind, TextSearch`IndexUpdate`PackagePrivate`obj]; Return[$Failed]; ]; TextSearch`IndexUpdate`PackagePrivate`handle = TextSearch`PackageScope`createHandle[TextSearch`IndexUpdate`PackagePrivate`obj]; If[FailureQ[TextSearch`IndexUpdate`PackagePrivate`handle], Message[AddToSearchIndex::badind, TextSearch`IndexUpdate`PackagePrivate`obj]; Return[$Failed]]; TextSearch`IndexUpdate`PackagePrivate`objs = Replace[TextSearch`IndexUpdate`PackagePrivate`list, TextSearch`IndexUpdate`PackagePrivate`assoc_Association :> ContentObject[TextSearch`IndexUpdate`PackagePrivate`assoc], {1}]; If[ !VectorQ[TextSearch`IndexUpdate`PackagePrivate`objs, TextSearch`ValidContentObjectQ], Message[AddToSearchIndex::invco]; Return[$Failed]]; Scan[Function[TextSearch`IndexUpdate`PackagePrivate`content, TextSearch`PackageScope`dAddToIndex[TextSearch`IndexUpdate`PackagePrivate`handle, TextSearch`IndexUpdate`PackagePrivate`content, TextSearch`IndexUpdate`PackagePrivate`uniquenessField /. TextSearch`IndexUpdate`PackagePrivate`f_String :> {TextSearch`IndexUpdate`PackagePrivate`f, TextSearch`IndexUpdate`PackagePrivate`content[TextSearch`IndexUpdate`PackagePrivate`f]}, Sequence @@ FilterRules[{TextSearch`IndexUpdate`PackagePrivate`opts}, Options[TextSearch`PackageScope`dAddToIndex]]]], TextSearch`IndexUpdate`PackagePrivate`objs]; ]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun addToSearchIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AddToSearchIndex", arguments.toMutableList(), options)
}
