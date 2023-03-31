import json
from typing import Union
from fastapi import FastAPI

app = FastAPI(openapi_url="/openapi.json")


def custom_openapi():
    with open("./openapi.json") as f:
        openapi = json.load(f)
    return openapi


app.openapi = custom_openapi
