package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TravelTime
 *
 * Full name:        System`TravelTime
 *
 *                   TravelTime[{loc , loc , …}] gives the estimated time to travel from loc  to loc , ….
 * Usage:                           1     2                                                 1       2
 *
 *                   TravelMethod -> Driving
 * Options:          UnitSystem :> $UnitSystem
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TravelTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/TravelTime.html
 *
 *                   TravelTime[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Replace[GIS`TravelDump`travelDirectionsInternal[TravelTime, GIS`TravelDump`locations, GIS`TravelDump`opts], GIS`TravelDump`td_TravelDirectionsData :> GIS`TravelDump`td["TravelTime"]]
 *                   TravelTime[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelTime::arginvll, GIS`TravelDump`arg], _, Message[TravelTime::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelTime[GIS`TravelDump`loc1:_String | _Entity | _GeoPosition, GIS`TravelDump`loc2:_String | _Entity | _GeoPosition, GIS`TravelDump`opts:OptionsPattern[]] := TravelTime[{GIS`TravelDump`loc1, GIS`TravelDump`loc2}, GIS`TravelDump`opts]
 *                   TravelTime[GIS`TravelDump`arg1:_String | _Entity | _GeoPosition, GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelTime::arginv, GIS`TravelDump`arg2]; False)
 *                   TravelTime[GIS`TravelDump`arg1:Except[_String | _Entity | _GeoPosition], GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelTime::arginv, GIS`TravelDump`arg1]; False)
 * Definitions:      TravelTime[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelTime[GIS`TravelDump`args], {1, 2}]; False)
 *
 * Own values:       None
 *
 *                   TravelTime[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Replace[GIS`TravelDump`travelDirectionsInternal[TravelTime, GIS`TravelDump`locations, GIS`TravelDump`opts], GIS`TravelDump`td_TravelDirectionsData :> GIS`TravelDump`td["TravelTime"]]
 *                   TravelTime[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelTime::arginvll, GIS`TravelDump`arg], _, Message[TravelTime::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelTime[GIS`TravelDump`loc1:_String | _Entity | _GeoPosition, GIS`TravelDump`loc2:_String | _Entity | _GeoPosition, GIS`TravelDump`opts:OptionsPattern[]] := TravelTime[{GIS`TravelDump`loc1, GIS`TravelDump`loc2}, GIS`TravelDump`opts]
 *                   TravelTime[GIS`TravelDump`arg1:_String | _Entity | _GeoPosition, GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelTime::arginv, GIS`TravelDump`arg2]; False)
 *                   TravelTime[GIS`TravelDump`arg1:Except[_String | _Entity | _GeoPosition], GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelTime::arginv, GIS`TravelDump`arg1]; False)
 * Down values:      TravelTime[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelTime[GIS`TravelDump`args], {1, 2}]; False)
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun travelTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TravelTime", arguments.toMutableList(), options)
}
