package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TravelDistanceList
 *
 * Full name:        System`TravelDistanceList
 *
 *                   TravelDistanceList[{loc , loc , …, loc }] returns the list {TravelDistance[loc , loc ], …, TravelDistance[loc     , loc ]}.
 * Usage:                                   1     2        n                                       1     2                        n - 1     n
 *
 *                   TravelMethod -> Driving
 * Options:          UnitSystem :> $UnitSystem
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TravelDistanceList
 * Documentation:    web: http://reference.wolfram.com/language/ref/TravelDistanceList.html
 *
 *                   TravelDistanceList[{_String | _Entity | _GeoPosition}, GIS`TravelDump`opts:OptionsPattern[]] := {}
 *                   TravelDistanceList[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Module[{GIS`TravelDump`td}, GIS`TravelDump`td = GIS`TravelDump`travelDirectionsInternal[TravelDistanceList, GIS`TravelDump`locations, GIS`TravelDump`opts]; If[Head[GIS`TravelDump`td] =!= TravelDirectionsData, Return[GIS`TravelDump`td]]; QuantityArray[(GIS`TravelDump`GeoUnitConvert[Quantity[#1, "Kilometers"], OptionValue[TravelDirections, {GIS`TravelDump`opts}, UnitSystem]] & ) /@ ("Distance" /. GIS`TravelDump`td[[2]]["Legs"])]]
 *                   TravelDistanceList[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDistanceList::arginvll, GIS`TravelDump`arg], _, Message[TravelDistanceList::arginvlt, GIS`TravelDump`arg]]; False)
 * Definitions:      TravelDistanceList[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDistanceList[GIS`TravelDump`args], 1]; False)
 *
 * Own values:       None
 *
 *                   TravelDistanceList[{_String | _Entity | _GeoPosition}, GIS`TravelDump`opts:OptionsPattern[]] := {}
 *                   TravelDistanceList[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Module[{GIS`TravelDump`td}, GIS`TravelDump`td = GIS`TravelDump`travelDirectionsInternal[TravelDistanceList, GIS`TravelDump`locations, GIS`TravelDump`opts]; If[Head[GIS`TravelDump`td] =!= TravelDirectionsData, Return[GIS`TravelDump`td]]; QuantityArray[(GIS`TravelDump`GeoUnitConvert[Quantity[#1, "Kilometers"], OptionValue[TravelDirections, {GIS`TravelDump`opts}, UnitSystem]] & ) /@ ("Distance" /. GIS`TravelDump`td[[2]]["Legs"])]]
 *                   TravelDistanceList[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDistanceList::arginvll, GIS`TravelDump`arg], _, Message[TravelDistanceList::arginvlt, GIS`TravelDump`arg]]; False)
 * Down values:      TravelDistanceList[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDistanceList[GIS`TravelDump`args], 1]; False)
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun travelDistanceList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TravelDistanceList", arguments.toMutableList(), options)
}
